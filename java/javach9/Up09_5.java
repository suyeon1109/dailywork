public class Up09_5 {
	public static void main(String[] args) {
		float sum=0;
		for(int i = 0; i < args.length; i++)
			sum+=Float.parseFloat(args[i]);
			// sum+=Float.valueOf(args[i]);
		
		/*
		Byte.valueOf() ���
		*/
			
		System.out.println("�հ��" + sum + "�Դϴ�.");
    }
}