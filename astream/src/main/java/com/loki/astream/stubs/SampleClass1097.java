package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1097 {

    @Ignore    private SampleClass1098 sampleClass;

    public SampleClass1097(){
        sampleClass = new SampleClass1098();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}