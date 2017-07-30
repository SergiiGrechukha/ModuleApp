package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1162 {

    @Ignore    private SampleClass1163 sampleClass;

    public SampleClass1162(){
        sampleClass = new SampleClass1163();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}