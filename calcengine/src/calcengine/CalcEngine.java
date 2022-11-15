package calcengine;

public class CalcEngine {

	
			public static void main(String[] args) {
				
<<<<<<< HEAD
				String msg = "Kenny's development branch";
				msg=msg.toUpperCase();
				
				System.out.println("_______________________________\n");
				System.out.println(msg);
				System.out.println("_______________________________\n\n");
				
			       performCalculations();
=======
				// Comment from Luckie
				System.out.println("Welcome to the Luckie's calcEngine branch.");
				System.out.println("------------------------------------------");
				System.out.println();
				
			        performCalculations();
>>>>>>> 39468290bc5e0568cb7dbae568c152c5d11f9fd6

			}
			   

			    static void performCalculations() {		    	
			        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
			        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
			        char[] opCodes = {'d', 'a', 's', 'm'};
			        double[] results = new double[opCodes.length];
			        		        
			        
			        for (int i = 0; i < opCodes.length; i++) {
			            results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);
			        }
			        for (double currentResult : results)
			            System.out.println("result = " + currentResult);

			    } 
			    
			   
			    static double execute(char opCode, double leftVal, double rightVal) {
			        double result;
			        switch (opCode) {
			            case 'a':
			                result = leftVal + rightVal;
			                break;
			            case 's':
			                result = leftVal - rightVal;
			                break;
			            case 'm':
			                result = leftVal * rightVal;
			                break;
			            case 'd':
			                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
			                break;
			            default:
			                System.out.println("Invalid opCode: " + opCode);
			                result = 0.0d;
			                break;
			        }
			        return result;
			    
	}

}
