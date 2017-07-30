package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1934 {

    @Ignore    private SampleClass1935 sampleClass;

    public SampleClass1934(){
        sampleClass = new SampleClass1935();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}