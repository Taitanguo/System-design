public class Solution{
    public int n, k;
    public List<Integer> ids = null;
    public Map<Integer, List<Integer>> machines = null;

    public static Solution create(int n, int k){
        Solution solution = new Solution();
        solution.n = n;
        solution.k = k;
        solution.ids = new ArrayList<Integer>(); // ids used to store ids candidate for machien id
        solution.machines = new HashMap<Integer, List<Integer>>();
        for(int i = 0; i < n; ++i){
            solution.ids.add(i);
        }
        return solution;
    }

    public List<Integer> addMachine(int machine_id){
        Random ra = new Random();
        List<Integer> random_nums = new ArrayList<Integer>();
        for(int i = 0; i < k; ++i){
            int index = ra.nextInt(ids.size());
            random_nums.add(ids.get(index));
            ids.remove(index);
        }
        Collections.sort(random_nums);
        return random_nums;
    }
    public int getMachineIdByHashCode(int hashcode){
        int distance = n + 1;
        int machine_id = 0;
        for(Map.Entry<Integer, List<Integer>> entry : machines.entrySet()){
            int key = entry.getKey();//this is the machine number
            List<Integer> random_nums = entry.getValue();
            for(Integer num : random_nums){
                int d = num - hashcode;
                if(d < 0){
                    d += n;
                }
                if(d < distance){ //离得最近 在一圈之内
                    distance = d;
                    machine_id = key;
                }
            }

        }
        return machine_id;
    }
}