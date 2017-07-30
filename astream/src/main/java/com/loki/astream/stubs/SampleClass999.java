package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass999 {

    @Ignore    private SampleClass1000 sampleClass;

    public SampleClass999(){
        sampleClass = new SampleClass1000();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}