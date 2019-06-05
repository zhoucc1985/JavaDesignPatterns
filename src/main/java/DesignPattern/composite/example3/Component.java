package DesignPattern.composite.example3;

import java.util.Iterator;
/**
 * ������������
 */
public abstract class Component {
	/**
	 * ��¼ÿ�������·��
	 */
	private String componentPath = "";
	/**
	 * ��ȡ�����·��
	 * @return �����·��
	 */
	public String getComponentPath() {
		return componentPath;
	}
	/**
	 * ���������·��
	 * @param componentPath �����·��
	 */
	public void setComponentPath(String componentPath) {
		this.componentPath = componentPath;
	}
	/**
	 * ��ȡ���������
	 * @return ���������
	 */
	public abstract String getName();
	
	/*-------------------������ԭ�еĶ���----------------------*/		
	
	/**
	 * ���������������
	 */
	public abstract void printStruct(String preStr);

	/**
	 * ����϶����м���������� 
	 * @param child ��������϶����е��������
	 */
	public void addChild(Component child) {
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ����������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");

	}

	/**
	 * ����϶������Ƴ�ĳ���������
	 * @param child ���Ƴ����������
	 */
	public void removeChild(Component child) {
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ����������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}

	/**
	 * ����ĳ��������Ӧ���������
	 * @param index ��Ҫ��ȡ����������������������0��ʼ
	 * @return ������Ӧ���������
	 */
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("����֧���������");
	}
}

