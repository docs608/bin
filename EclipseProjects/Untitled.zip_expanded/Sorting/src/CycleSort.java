import java.util.Arrays;

public class CycleSort {
	
	public int[] sort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return arr;
		}
		int writes = cycleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("writes: " + writes);
		return arr;
	}
	
    int cycleSort(int[] arr) {
        int writes = 0;
 
        for (int cycleStart = 0; cycleStart < arr.length - 1; cycleStart++) {
            int val = arr[cycleStart];
//            System.out.println("val: " + val);
 
            // count the number of values that are smaller than val
            // since cycleStart
            int pos = cycleStart;
            for (int i = cycleStart + 1; i < arr.length; i++)
                if (arr[i] < val)
                    pos++;
//            System.out.println("pos: " + pos);
 
            // there aren't any
            if (pos == cycleStart)
                continue;
 
            // skip duplicates
            while (val == arr[pos])
                pos++;
 
            // put val into final position
            int tmp = arr[pos];
            arr[pos] = val;
            val = tmp;
            writes++;
            System.out.println(Arrays.toString(arr));
            System.out.println("writes: " + writes);
 
            // repeat as long as we can find values to swap
            // otherwise start new cycle
            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < arr.length; i++)
                    if (arr[i] < val)
                        pos++;
 
                while (val == arr[pos])
                    pos++;
 
                tmp = arr[pos];
                arr[pos] = val;
                val = tmp;
                writes++;
                System.out.println(Arrays.toString(arr));
                System.out.println("writes: " + writes);
            }
        }
        return writes;
    }
    
}
