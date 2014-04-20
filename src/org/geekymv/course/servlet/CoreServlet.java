package org.geekymv.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.geekymv.course.service.CoreService;
import org.geekymv.course.util.SignUtil;


/**
 * ������������
 */
public class CoreServlet extends HttpServlet {
	private static final long serialVersionUID = 4440739483644821986L;

	/**
	 * ȷ����������΢�ŷ�����
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String signature = request.getParameter("signature");	// ΢�ż���ǩ��
		String timestamp = request.getParameter("timestamp");	// ʱ���
		String nonce = request.getParameter("nonce");	// �����
		String echostr = request.getParameter("echostr");	// ����ַ���

		PrintWriter out = response.getWriter();
		// ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}
		out.close();
		out = null;
	}

	/**
	 * ����΢�ŷ�������������Ϣ
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��������Ӧ�ı��������Ϊutf-8 ���Ա�����������
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//���ú���ҵ���������Ϣ��������Ϣ
		String respMessage = CoreService.processRequest(request);

		//��Ӧ��Ϣ
		PrintWriter out = response.getWriter();
		out.print(respMessage);
		out.close();

	}

}

























