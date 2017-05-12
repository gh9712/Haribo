

/**
 * 계산식
 * 보험료 = (보상금 * 확률 * 1.1) / (보험기간(년) * 12)
 * 확률은 나이 성별 직업군 병력에 대한 확률을 임의로 계산하여 정한다.
 * @author gh971
 * @version 1.0
 * @created 28-4-2017 오전 11:08:44
 */
public class Insurance {

	private String description;
	private int fee;
	private int ID;
	private String Name;
	public InsuranceInfo m_InsuranceInfo;
	public InsuranceFeeInfo m_InsuranceFeeInfo;
	public Member m_Member;

	public Insurance(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param UserInfo
	 */
	public void calculator(MemberInfo memberInfo){

	}

	/**
	 * 
	 * @param userInfo
	 */
	public void call(MemberInfo memberInfo){

	}

	public int getID(){
		return 0;
	}

	public void predict(){

	}

	/**
	 * 
	 * @param Description
	 */
	public void setDescription(String Description){

	}

	/**
	 * 
	 * @param id
	 */
	public void setID(int id){

	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name){

	}

	public void sort(){

	}

}