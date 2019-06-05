package DesignPattern.composite.example3;
import java.util.*;

/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 */
public class Composite extends Component{
	public String getName(){
		return this.name;
	}
	public void addChild(Component child) {
		//�ӳٳ�ʼ��
		if (childComponents == null) {
			childComponents = new ArrayList<Component>();
		}
		childComponents.add(child);		
		
		//���ж����·���Ƿ�Ϊ�գ����Ϊ�գ�˵��������Ǹ����
		if(this.getComponentPath()==null || this.getComponentPath().trim().length()==0){
			//�ѱ������name���õ����·����
			this.setComponentPath(this.name);
			System.out.println("now root  cp = "+this.getComponentPath());
		}
		//�ж�Ҫ����������·�����Ƿ���ֹ�
		//���ж��Ƿ��Ǹ����
		if(this.getComponentPath().startsWith(child.getName()+".")){
			//˵���Ǹ�������ظ������
			throw new IllegalArgumentException("�ڱ�ͨ·�ϣ���� '"+child.getName()+"' �ѱ���ӹ���");
		}else{
			if(this.getComponentPath().indexOf("."+child.getName()) < 0){
				//��ʾû�г��ֹ�,��ô���Լ���
				//���������·��
				String componentPath = this.getComponentPath()+"."+child.getName();
				//�����������·��
				child.setComponentPath(componentPath);
				System.out.println("now  cp = "+child.getComponentPath());
			}else{
				throw new IllegalArgumentException("�ڱ�ͨ·�ϣ���� '"+child.getName()+"' �ѱ���ӹ���");
			}		
		}
	}
	
	/*---------------������ԭ�е�ʵ�֣�û�б仯------------------*/		
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;
	/**
	 * ��϶��������
	 */
	private String name = "";
	/**
	 * ���췽����������϶��������
	 * @param name ��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	/**
	 * �����϶�������Ľṹ
	 * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	public void printStruct(String preStr){
		//�Ȱ��Լ����ȥ
		System.out.println(preStr+"+"+this.name);
		//��������������������ô�������Щ���������
		if(this.childComponents!=null){
			//Ȼ�����һ���ո񣬱�ʾ�������һ���ո�
			preStr+=" ";		
			//�����ǰ������Ӷ�����
			for(Component c : childComponents){
				//�ݹ����ÿ���Ӷ���
				c.printStruct(preStr);
			}
		}
	}
}
