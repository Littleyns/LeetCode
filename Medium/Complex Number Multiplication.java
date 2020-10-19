class Solution {
    public String complexNumberMultiply(String a, String b) {
        
        
    		
		String[] z1 = new String[2];
		String[] z2 = new String[2];
		int complexSignA = 0;
		int complexSignB = 0;

		for (int i = 0; i < 2; i++) {
			z1[i] = "0";
			z2[i] = "0";
		}
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == '+' && a.charAt(i + 1) == '-') {
				
				z1[0] = a.substring(0, i);
				z1[1]=a.substring(i+2,a.length()-1);
				complexSignA = -1;
				break;
			}
			if (a.charAt(i) == '+' && a.charAt(i + 1) != '-') {
				complexSignA = 1;
				z1[0] = a.substring(0, i);
				z1[1]=a.substring(i+1,a.length()-1);
				
				break;
			}
		}
		for (int i = 0; i < b.length() - 1; i++) {
			if (b.charAt(i) == '+' && b.charAt(i + 1) == '-') {
				
				z2[0] = b.substring(0, i);
				z2[1]=b.substring(i+2,b.length()-1);
				complexSignB = -1;
				break;
			}
			if (b.charAt(i) == '+' && b.charAt(i + 1) != '-') {
				complexSignB = 1;
				z2[0] = b.substring(0, i);
				z2[1]=b.substring(i+1,b.length()-1);
				
				break;
			}
		}
		
		
		int r1 = Integer.parseInt(z1[0],10) ;
		int r2 = Integer.parseInt(z2[0],10);
		int i1 = Integer.parseInt(z1[1],10) ;
		int i2 = Integer.parseInt(z2[1],10);

		String res = (r1*r2)-(complexSignA*complexSignB*i1*i2)+"+"+((r1*i2*complexSignB)+(complexSignA*r2*i1))+"i";
		
return res;
       
    }
    
    
}