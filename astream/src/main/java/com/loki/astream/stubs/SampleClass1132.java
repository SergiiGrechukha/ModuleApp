package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1132 {

    @Ignore    private SampleClass1133 sampleClass;

    public SampleClass1132(){
        sampleClass = new SampleClass1133();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}