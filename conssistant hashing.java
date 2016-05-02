public class Solution{
    public List<List<Integer>> consistentHashing(int n){
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> machine = new ArrayList<Integer>();
        machine.add(0);
        machine.add(359);
        machine.add(1);
        results.add(machine);
        for(int i = 1; i < n; ++i){
            List<Integer> new_machine = new ArrayList<Integer>();
            int index = 0;
            //find the largest interval
            for(int j = 1; j < i; ++j){ //j means from 1 to j and then relocate the location of the id
                if(results.get(j).get(1) - results.get(j).get(0) + 1 > results.get(index).get(1) - results.get(index).get(0) + 1)
                    index = j; // consequently this index points to the maximum interval
            }
            int x = results.get(index).get(0);
            int y = results.get(index).get(1);
            results.get(index).set(1, (x + y) / 2);//1 代表三个参数中的第二个 也就是结束位置

            new_machine.add((x + y)/2 + 1);
            new_machine.add(y);
            new_machine.add(i + 1);
            results.add(new_machine);
        }
        return results;
    }
}