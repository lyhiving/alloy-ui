package com.liferay.alloy.taglib.alloy.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * <a href="BaseIORequestTag.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public class BaseIORequestTag extends com.liferay.taglib.util.IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	protected String getPage() {
		return _PAGE;
	}

	public java.lang.Boolean getActive() {
		return _active;
	}

	public java.lang.Object getArguments() {
		return _arguments;
	}

	public java.lang.Boolean getAutoLoad() {
		return _autoLoad;
	}

	public java.lang.Boolean getCache() {
		return _cache;
	}

	public java.lang.String getCfg() {
		return _cfg;
	}

	public java.lang.Object getContext() {
		return _context;
	}

	public java.lang.Object getData() {
		return _data;
	}

	public java.lang.String getDataType() {
		return _dataType;
	}

	public java.lang.Boolean getDestroyed() {
		return _destroyed;
	}

	public java.lang.Object getForm() {
		return _form;
	}

	public java.lang.Object getHeaders() {
		return _headers;
	}

	public java.lang.Object getHost() {
		return _host;
	}

	public java.lang.Boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getMethod() {
		return _method;
	}

	public java.lang.Object getResponseData() {
		return _responseData;
	}

	public java.lang.Boolean getSync() {
		return _sync;
	}

	public java.lang.Object getTimeout() {
		return _timeout;
	}

	public java.lang.Object getTransaction() {
		return _transaction;
	}

	public java.lang.String getUri() {
		return _uri;
	}

	public java.lang.Object getXdr() {
		return _xdr;
	}

	public java.lang.Object getAfterActiveChange() {
		return _afterActiveChange;
	}

	public java.lang.Object getAfterArgumentsChange() {
		return _afterArgumentsChange;
	}

	public java.lang.Object getAfterAutoLoadChange() {
		return _afterAutoLoadChange;
	}

	public java.lang.Object getAfterCacheChange() {
		return _afterCacheChange;
	}

	public java.lang.Object getAfterCfgChange() {
		return _afterCfgChange;
	}

	public java.lang.Object getAfterContextChange() {
		return _afterContextChange;
	}

	public java.lang.Object getAfterDataChange() {
		return _afterDataChange;
	}

	public java.lang.Object getAfterDataTypeChange() {
		return _afterDataTypeChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterFormChange() {
		return _afterFormChange;
	}

	public java.lang.Object getAfterHeadersChange() {
		return _afterHeadersChange;
	}

	public java.lang.Object getAfterHostChange() {
		return _afterHostChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterComplete() {
		return _afterComplete;
	}

	public java.lang.Object getAfterEnd() {
		return _afterEnd;
	}

	public java.lang.Object getAfterFailure() {
		return _afterFailure;
	}

	public java.lang.Object getAfterStart() {
		return _afterStart;
	}

	public java.lang.Object getAfterSuccess() {
		return _afterSuccess;
	}

	public java.lang.Object getAfterXdrReady() {
		return _afterXdrReady;
	}

	public java.lang.Object getAfterMethodChange() {
		return _afterMethodChange;
	}

	public java.lang.Object getAfterResponseDataChange() {
		return _afterResponseDataChange;
	}

	public java.lang.Object getAfterSyncChange() {
		return _afterSyncChange;
	}

	public java.lang.Object getAfterTimeoutChange() {
		return _afterTimeoutChange;
	}

	public java.lang.Object getAfterTransactionChange() {
		return _afterTransactionChange;
	}

	public java.lang.Object getAfterUriChange() {
		return _afterUriChange;
	}

	public java.lang.Object getAfterXdrChange() {
		return _afterXdrChange;
	}

	public java.lang.Object getOnActiveChange() {
		return _onActiveChange;
	}

	public java.lang.Object getOnArgumentsChange() {
		return _onArgumentsChange;
	}

	public java.lang.Object getOnAutoLoadChange() {
		return _onAutoLoadChange;
	}

	public java.lang.Object getOnCacheChange() {
		return _onCacheChange;
	}

	public java.lang.Object getOnCfgChange() {
		return _onCfgChange;
	}

	public java.lang.Object getOnContextChange() {
		return _onContextChange;
	}

	public java.lang.Object getOnDataChange() {
		return _onDataChange;
	}

	public java.lang.Object getOnDataTypeChange() {
		return _onDataTypeChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnFormChange() {
		return _onFormChange;
	}

	public java.lang.Object getOnHeadersChange() {
		return _onHeadersChange;
	}

	public java.lang.Object getOnHostChange() {
		return _onHostChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnComplete() {
		return _onComplete;
	}

	public java.lang.Object getOnEnd() {
		return _onEnd;
	}

	public java.lang.Object getOnFailure() {
		return _onFailure;
	}

	public java.lang.Object getOnStart() {
		return _onStart;
	}

	public java.lang.Object getOnSuccess() {
		return _onSuccess;
	}

	public java.lang.Object getOnXdrReady() {
		return _onXdrReady;
	}

	public java.lang.Object getOnMethodChange() {
		return _onMethodChange;
	}

	public java.lang.Object getOnResponseDataChange() {
		return _onResponseDataChange;
	}

	public java.lang.Object getOnSyncChange() {
		return _onSyncChange;
	}

	public java.lang.Object getOnTimeoutChange() {
		return _onTimeoutChange;
	}

	public java.lang.Object getOnTransactionChange() {
		return _onTransactionChange;
	}

	public java.lang.Object getOnUriChange() {
		return _onUriChange;
	}

	public java.lang.Object getOnXdrChange() {
		return _onXdrChange;
	}

	public void setActive(java.lang.Boolean active) {
		_active = active;

		setScopedAttribute("active", active);
	}

	public void setArguments(java.lang.Object arguments) {
		_arguments = arguments;

		setScopedAttribute("arguments", arguments);
	}

	public void setAutoLoad(java.lang.Boolean autoLoad) {
		_autoLoad = autoLoad;

		setScopedAttribute("autoLoad", autoLoad);
	}

	public void setCache(java.lang.Boolean cache) {
		_cache = cache;

		setScopedAttribute("cache", cache);
	}

	public void setCfg(java.lang.String cfg) {
		_cfg = cfg;

		setScopedAttribute("cfg", cfg);
	}

	public void setContext(java.lang.Object context) {
		_context = context;

		setScopedAttribute("context", context);
	}

	public void setData(java.lang.Object data) {
		_data = data;

		setScopedAttribute("data", data);
	}

	public void setDataType(java.lang.String dataType) {
		_dataType = dataType;

		setScopedAttribute("dataType", dataType);
	}

	public void setDestroyed(java.lang.Boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setForm(java.lang.Object form) {
		_form = form;

		setScopedAttribute("form", form);
	}

	public void setHeaders(java.lang.Object headers) {
		_headers = headers;

		setScopedAttribute("headers", headers);
	}

	public void setHost(java.lang.Object host) {
		_host = host;

		setScopedAttribute("host", host);
	}

	public void setInitialized(java.lang.Boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setMethod(java.lang.String method) {
		_method = method;

		setScopedAttribute("method", method);
	}

	public void setResponseData(java.lang.Object responseData) {
		_responseData = responseData;

		setScopedAttribute("responseData", responseData);
	}

	public void setSync(java.lang.Boolean sync) {
		_sync = sync;

		setScopedAttribute("sync", sync);
	}

	public void setTimeout(java.lang.Object timeout) {
		_timeout = timeout;

		setScopedAttribute("timeout", timeout);
	}

	public void setTransaction(java.lang.Object transaction) {
		_transaction = transaction;

		setScopedAttribute("transaction", transaction);
	}

	public void setUri(java.lang.String uri) {
		_uri = uri;

		setScopedAttribute("uri", uri);
	}

	public void setXdr(java.lang.Object xdr) {
		_xdr = xdr;

		setScopedAttribute("xdr", xdr);
	}

	public void setAfterActiveChange(java.lang.Object afterActiveChange) {
		_afterActiveChange = afterActiveChange;

		setScopedAttribute("afterActiveChange", afterActiveChange);
	}

	public void setAfterArgumentsChange(java.lang.Object afterArgumentsChange) {
		_afterArgumentsChange = afterArgumentsChange;

		setScopedAttribute("afterArgumentsChange", afterArgumentsChange);
	}

	public void setAfterAutoLoadChange(java.lang.Object afterAutoLoadChange) {
		_afterAutoLoadChange = afterAutoLoadChange;

		setScopedAttribute("afterAutoLoadChange", afterAutoLoadChange);
	}

	public void setAfterCacheChange(java.lang.Object afterCacheChange) {
		_afterCacheChange = afterCacheChange;

		setScopedAttribute("afterCacheChange", afterCacheChange);
	}

	public void setAfterCfgChange(java.lang.Object afterCfgChange) {
		_afterCfgChange = afterCfgChange;

		setScopedAttribute("afterCfgChange", afterCfgChange);
	}

	public void setAfterContextChange(java.lang.Object afterContextChange) {
		_afterContextChange = afterContextChange;

		setScopedAttribute("afterContextChange", afterContextChange);
	}

	public void setAfterDataChange(java.lang.Object afterDataChange) {
		_afterDataChange = afterDataChange;

		setScopedAttribute("afterDataChange", afterDataChange);
	}

	public void setAfterDataTypeChange(java.lang.Object afterDataTypeChange) {
		_afterDataTypeChange = afterDataTypeChange;

		setScopedAttribute("afterDataTypeChange", afterDataTypeChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterFormChange(java.lang.Object afterFormChange) {
		_afterFormChange = afterFormChange;

		setScopedAttribute("afterFormChange", afterFormChange);
	}

	public void setAfterHeadersChange(java.lang.Object afterHeadersChange) {
		_afterHeadersChange = afterHeadersChange;

		setScopedAttribute("afterHeadersChange", afterHeadersChange);
	}

	public void setAfterHostChange(java.lang.Object afterHostChange) {
		_afterHostChange = afterHostChange;

		setScopedAttribute("afterHostChange", afterHostChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterComplete(java.lang.Object afterComplete) {
		_afterComplete = afterComplete;

		setScopedAttribute("afterComplete", afterComplete);
	}

	public void setAfterEnd(java.lang.Object afterEnd) {
		_afterEnd = afterEnd;

		setScopedAttribute("afterEnd", afterEnd);
	}

	public void setAfterFailure(java.lang.Object afterFailure) {
		_afterFailure = afterFailure;

		setScopedAttribute("afterFailure", afterFailure);
	}

	public void setAfterStart(java.lang.Object afterStart) {
		_afterStart = afterStart;

		setScopedAttribute("afterStart", afterStart);
	}

	public void setAfterSuccess(java.lang.Object afterSuccess) {
		_afterSuccess = afterSuccess;

		setScopedAttribute("afterSuccess", afterSuccess);
	}

	public void setAfterXdrReady(java.lang.Object afterXdrReady) {
		_afterXdrReady = afterXdrReady;

		setScopedAttribute("afterXdrReady", afterXdrReady);
	}

	public void setAfterMethodChange(java.lang.Object afterMethodChange) {
		_afterMethodChange = afterMethodChange;

		setScopedAttribute("afterMethodChange", afterMethodChange);
	}

	public void setAfterResponseDataChange(java.lang.Object afterResponseDataChange) {
		_afterResponseDataChange = afterResponseDataChange;

		setScopedAttribute("afterResponseDataChange", afterResponseDataChange);
	}

	public void setAfterSyncChange(java.lang.Object afterSyncChange) {
		_afterSyncChange = afterSyncChange;

		setScopedAttribute("afterSyncChange", afterSyncChange);
	}

	public void setAfterTimeoutChange(java.lang.Object afterTimeoutChange) {
		_afterTimeoutChange = afterTimeoutChange;

		setScopedAttribute("afterTimeoutChange", afterTimeoutChange);
	}

	public void setAfterTransactionChange(java.lang.Object afterTransactionChange) {
		_afterTransactionChange = afterTransactionChange;

		setScopedAttribute("afterTransactionChange", afterTransactionChange);
	}

	public void setAfterUriChange(java.lang.Object afterUriChange) {
		_afterUriChange = afterUriChange;

		setScopedAttribute("afterUriChange", afterUriChange);
	}

	public void setAfterXdrChange(java.lang.Object afterXdrChange) {
		_afterXdrChange = afterXdrChange;

		setScopedAttribute("afterXdrChange", afterXdrChange);
	}

	public void setOnActiveChange(java.lang.Object onActiveChange) {
		_onActiveChange = onActiveChange;

		setScopedAttribute("onActiveChange", onActiveChange);
	}

	public void setOnArgumentsChange(java.lang.Object onArgumentsChange) {
		_onArgumentsChange = onArgumentsChange;

		setScopedAttribute("onArgumentsChange", onArgumentsChange);
	}

	public void setOnAutoLoadChange(java.lang.Object onAutoLoadChange) {
		_onAutoLoadChange = onAutoLoadChange;

		setScopedAttribute("onAutoLoadChange", onAutoLoadChange);
	}

	public void setOnCacheChange(java.lang.Object onCacheChange) {
		_onCacheChange = onCacheChange;

		setScopedAttribute("onCacheChange", onCacheChange);
	}

	public void setOnCfgChange(java.lang.Object onCfgChange) {
		_onCfgChange = onCfgChange;

		setScopedAttribute("onCfgChange", onCfgChange);
	}

	public void setOnContextChange(java.lang.Object onContextChange) {
		_onContextChange = onContextChange;

		setScopedAttribute("onContextChange", onContextChange);
	}

	public void setOnDataChange(java.lang.Object onDataChange) {
		_onDataChange = onDataChange;

		setScopedAttribute("onDataChange", onDataChange);
	}

	public void setOnDataTypeChange(java.lang.Object onDataTypeChange) {
		_onDataTypeChange = onDataTypeChange;

		setScopedAttribute("onDataTypeChange", onDataTypeChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnFormChange(java.lang.Object onFormChange) {
		_onFormChange = onFormChange;

		setScopedAttribute("onFormChange", onFormChange);
	}

	public void setOnHeadersChange(java.lang.Object onHeadersChange) {
		_onHeadersChange = onHeadersChange;

		setScopedAttribute("onHeadersChange", onHeadersChange);
	}

	public void setOnHostChange(java.lang.Object onHostChange) {
		_onHostChange = onHostChange;

		setScopedAttribute("onHostChange", onHostChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnComplete(java.lang.Object onComplete) {
		_onComplete = onComplete;

		setScopedAttribute("onComplete", onComplete);
	}

	public void setOnEnd(java.lang.Object onEnd) {
		_onEnd = onEnd;

		setScopedAttribute("onEnd", onEnd);
	}

	public void setOnFailure(java.lang.Object onFailure) {
		_onFailure = onFailure;

		setScopedAttribute("onFailure", onFailure);
	}

	public void setOnStart(java.lang.Object onStart) {
		_onStart = onStart;

		setScopedAttribute("onStart", onStart);
	}

	public void setOnSuccess(java.lang.Object onSuccess) {
		_onSuccess = onSuccess;

		setScopedAttribute("onSuccess", onSuccess);
	}

	public void setOnXdrReady(java.lang.Object onXdrReady) {
		_onXdrReady = onXdrReady;

		setScopedAttribute("onXdrReady", onXdrReady);
	}

	public void setOnMethodChange(java.lang.Object onMethodChange) {
		_onMethodChange = onMethodChange;

		setScopedAttribute("onMethodChange", onMethodChange);
	}

	public void setOnResponseDataChange(java.lang.Object onResponseDataChange) {
		_onResponseDataChange = onResponseDataChange;

		setScopedAttribute("onResponseDataChange", onResponseDataChange);
	}

	public void setOnSyncChange(java.lang.Object onSyncChange) {
		_onSyncChange = onSyncChange;

		setScopedAttribute("onSyncChange", onSyncChange);
	}

	public void setOnTimeoutChange(java.lang.Object onTimeoutChange) {
		_onTimeoutChange = onTimeoutChange;

		setScopedAttribute("onTimeoutChange", onTimeoutChange);
	}

	public void setOnTransactionChange(java.lang.Object onTransactionChange) {
		_onTransactionChange = onTransactionChange;

		setScopedAttribute("onTransactionChange", onTransactionChange);
	}

	public void setOnUriChange(java.lang.Object onUriChange) {
		_onUriChange = onUriChange;

		setScopedAttribute("onUriChange", onUriChange);
	}

	public void setOnXdrChange(java.lang.Object onXdrChange) {
		_onXdrChange = onXdrChange;

		setScopedAttribute("onXdrChange", onXdrChange);
	}

	protected void setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "active", _active);
		setNamespacedAttribute(request, "arguments", _arguments);
		setNamespacedAttribute(request, "autoLoad", _autoLoad);
		setNamespacedAttribute(request, "cache", _cache);
		setNamespacedAttribute(request, "cfg", _cfg);
		setNamespacedAttribute(request, "context", _context);
		setNamespacedAttribute(request, "data", _data);
		setNamespacedAttribute(request, "dataType", _dataType);
		setNamespacedAttribute(request, "destroyed", _destroyed);
		setNamespacedAttribute(request, "form", _form);
		setNamespacedAttribute(request, "headers", _headers);
		setNamespacedAttribute(request, "host", _host);
		setNamespacedAttribute(request, "initialized", _initialized);
		setNamespacedAttribute(request, "method", _method);
		setNamespacedAttribute(request, "responseData", _responseData);
		setNamespacedAttribute(request, "sync", _sync);
		setNamespacedAttribute(request, "timeout", _timeout);
		setNamespacedAttribute(request, "transaction", _transaction);
		setNamespacedAttribute(request, "uri", _uri);
		setNamespacedAttribute(request, "xdr", _xdr);
		setNamespacedAttribute(request, "afterActiveChange", _afterActiveChange);
		setNamespacedAttribute(request, "afterArgumentsChange", _afterArgumentsChange);
		setNamespacedAttribute(request, "afterAutoLoadChange", _afterAutoLoadChange);
		setNamespacedAttribute(request, "afterCacheChange", _afterCacheChange);
		setNamespacedAttribute(request, "afterCfgChange", _afterCfgChange);
		setNamespacedAttribute(request, "afterContextChange", _afterContextChange);
		setNamespacedAttribute(request, "afterDataChange", _afterDataChange);
		setNamespacedAttribute(request, "afterDataTypeChange", _afterDataTypeChange);
		setNamespacedAttribute(request, "afterDestroy", _afterDestroy);
		setNamespacedAttribute(request, "afterDestroyedChange", _afterDestroyedChange);
		setNamespacedAttribute(request, "afterFormChange", _afterFormChange);
		setNamespacedAttribute(request, "afterHeadersChange", _afterHeadersChange);
		setNamespacedAttribute(request, "afterHostChange", _afterHostChange);
		setNamespacedAttribute(request, "afterInit", _afterInit);
		setNamespacedAttribute(request, "afterInitializedChange", _afterInitializedChange);
		setNamespacedAttribute(request, "afterComplete", _afterComplete);
		setNamespacedAttribute(request, "afterEnd", _afterEnd);
		setNamespacedAttribute(request, "afterFailure", _afterFailure);
		setNamespacedAttribute(request, "afterStart", _afterStart);
		setNamespacedAttribute(request, "afterSuccess", _afterSuccess);
		setNamespacedAttribute(request, "afterXdrReady", _afterXdrReady);
		setNamespacedAttribute(request, "afterMethodChange", _afterMethodChange);
		setNamespacedAttribute(request, "afterResponseDataChange", _afterResponseDataChange);
		setNamespacedAttribute(request, "afterSyncChange", _afterSyncChange);
		setNamespacedAttribute(request, "afterTimeoutChange", _afterTimeoutChange);
		setNamespacedAttribute(request, "afterTransactionChange", _afterTransactionChange);
		setNamespacedAttribute(request, "afterUriChange", _afterUriChange);
		setNamespacedAttribute(request, "afterXdrChange", _afterXdrChange);
		setNamespacedAttribute(request, "onActiveChange", _onActiveChange);
		setNamespacedAttribute(request, "onArgumentsChange", _onArgumentsChange);
		setNamespacedAttribute(request, "onAutoLoadChange", _onAutoLoadChange);
		setNamespacedAttribute(request, "onCacheChange", _onCacheChange);
		setNamespacedAttribute(request, "onCfgChange", _onCfgChange);
		setNamespacedAttribute(request, "onContextChange", _onContextChange);
		setNamespacedAttribute(request, "onDataChange", _onDataChange);
		setNamespacedAttribute(request, "onDataTypeChange", _onDataTypeChange);
		setNamespacedAttribute(request, "onDestroy", _onDestroy);
		setNamespacedAttribute(request, "onDestroyedChange", _onDestroyedChange);
		setNamespacedAttribute(request, "onFormChange", _onFormChange);
		setNamespacedAttribute(request, "onHeadersChange", _onHeadersChange);
		setNamespacedAttribute(request, "onHostChange", _onHostChange);
		setNamespacedAttribute(request, "onInit", _onInit);
		setNamespacedAttribute(request, "onInitializedChange", _onInitializedChange);
		setNamespacedAttribute(request, "onComplete", _onComplete);
		setNamespacedAttribute(request, "onEnd", _onEnd);
		setNamespacedAttribute(request, "onFailure", _onFailure);
		setNamespacedAttribute(request, "onStart", _onStart);
		setNamespacedAttribute(request, "onSuccess", _onSuccess);
		setNamespacedAttribute(request, "onXdrReady", _onXdrReady);
		setNamespacedAttribute(request, "onMethodChange", _onMethodChange);
		setNamespacedAttribute(request, "onResponseDataChange", _onResponseDataChange);
		setNamespacedAttribute(request, "onSyncChange", _onSyncChange);
		setNamespacedAttribute(request, "onTimeoutChange", _onTimeoutChange);
		setNamespacedAttribute(request, "onTransactionChange", _onTransactionChange);
		setNamespacedAttribute(request, "onUriChange", _onUriChange);
		setNamespacedAttribute(request, "onXdrChange", _onXdrChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "alloy:io-request:";

	private static final String _PAGE =
		"/html/taglib/alloy/io_request/page.jsp";

	protected java.lang.Boolean _active;
	protected java.lang.Object _arguments;
	protected java.lang.Boolean _autoLoad;
	protected java.lang.Boolean _cache;
	protected java.lang.String _cfg;
	protected java.lang.Object _context;
	protected java.lang.Object _data;
	protected java.lang.String _dataType;
	protected java.lang.Boolean _destroyed;
	protected java.lang.Object _form;
	protected java.lang.Object _headers;
	protected java.lang.Object _host;
	protected java.lang.Boolean _initialized;
	protected java.lang.String _method;
	protected java.lang.Object _responseData;
	protected java.lang.Boolean _sync;
	protected java.lang.Object _timeout;
	protected java.lang.Object _transaction;
	protected java.lang.String _uri;
	protected java.lang.Object _xdr;
	protected java.lang.Object _afterActiveChange;
	protected java.lang.Object _afterArgumentsChange;
	protected java.lang.Object _afterAutoLoadChange;
	protected java.lang.Object _afterCacheChange;
	protected java.lang.Object _afterCfgChange;
	protected java.lang.Object _afterContextChange;
	protected java.lang.Object _afterDataChange;
	protected java.lang.Object _afterDataTypeChange;
	protected java.lang.Object _afterDestroy;
	protected java.lang.Object _afterDestroyedChange;
	protected java.lang.Object _afterFormChange;
	protected java.lang.Object _afterHeadersChange;
	protected java.lang.Object _afterHostChange;
	protected java.lang.Object _afterInit;
	protected java.lang.Object _afterInitializedChange;
	protected java.lang.Object _afterComplete;
	protected java.lang.Object _afterEnd;
	protected java.lang.Object _afterFailure;
	protected java.lang.Object _afterStart;
	protected java.lang.Object _afterSuccess;
	protected java.lang.Object _afterXdrReady;
	protected java.lang.Object _afterMethodChange;
	protected java.lang.Object _afterResponseDataChange;
	protected java.lang.Object _afterSyncChange;
	protected java.lang.Object _afterTimeoutChange;
	protected java.lang.Object _afterTransactionChange;
	protected java.lang.Object _afterUriChange;
	protected java.lang.Object _afterXdrChange;
	protected java.lang.Object _onActiveChange;
	protected java.lang.Object _onArgumentsChange;
	protected java.lang.Object _onAutoLoadChange;
	protected java.lang.Object _onCacheChange;
	protected java.lang.Object _onCfgChange;
	protected java.lang.Object _onContextChange;
	protected java.lang.Object _onDataChange;
	protected java.lang.Object _onDataTypeChange;
	protected java.lang.Object _onDestroy;
	protected java.lang.Object _onDestroyedChange;
	protected java.lang.Object _onFormChange;
	protected java.lang.Object _onHeadersChange;
	protected java.lang.Object _onHostChange;
	protected java.lang.Object _onInit;
	protected java.lang.Object _onInitializedChange;
	protected java.lang.Object _onComplete;
	protected java.lang.Object _onEnd;
	protected java.lang.Object _onFailure;
	protected java.lang.Object _onStart;
	protected java.lang.Object _onSuccess;
	protected java.lang.Object _onXdrReady;
	protected java.lang.Object _onMethodChange;
	protected java.lang.Object _onResponseDataChange;
	protected java.lang.Object _onSyncChange;
	protected java.lang.Object _onTimeoutChange;
	protected java.lang.Object _onTransactionChange;
	protected java.lang.Object _onUriChange;
	protected java.lang.Object _onXdrChange;

}