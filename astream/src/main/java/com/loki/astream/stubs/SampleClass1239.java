package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1239 {

    @Ignore    private SampleClass1240 sampleClass;

    public SampleClass1239(){
        sampleClass = new SampleClass1240();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}