package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1358 {

    @Ignore    private SampleClass1359 sampleClass;

    public SampleClass1358(){
        sampleClass = new SampleClass1359();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}