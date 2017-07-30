package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1414 {

    @Ignore    private SampleClass1415 sampleClass;

    public SampleClass1414(){
        sampleClass = new SampleClass1415();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}