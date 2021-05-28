package pojo.board.step2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

//@Configuration
//@Controller
public class BoardController{
	Logger logger = Logger.getLogger(BoardController.class);
	private BoardLogic boardLogic = new BoardLogic();
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) {
		logger.info("execute 호출성공");
		ActionForward forward = new ActionForward();
		String viewName =null;
		boolean isRedirect =false;
		String crud = (String)req.getAttribute("crud");
		if("boardInsert".equals(crud)){
			logger.info("글쓰기 호출 성공");
			viewName = "crudBoard.po2?crud=getBoardList";
			isRedirect = true;
			forward.setRedirect(isRedirect);
			forward.setPath(viewName);
		}
		return forward;
	}
}
