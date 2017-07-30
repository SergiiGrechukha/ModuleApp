package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1721 {

    @Ignore    private SampleClass1722 sampleClass;

    public SampleClass1721(){
        sampleClass = new SampleClass1722();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}