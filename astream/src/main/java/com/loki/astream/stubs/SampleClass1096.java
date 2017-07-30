package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1096 {

    @Ignore    private SampleClass1097 sampleClass;

    public SampleClass1096(){
        sampleClass = new SampleClass1097();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}