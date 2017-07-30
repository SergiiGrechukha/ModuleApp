package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1935 {

    @Ignore    private SampleClass1936 sampleClass;

    public SampleClass1935(){
        sampleClass = new SampleClass1936();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}