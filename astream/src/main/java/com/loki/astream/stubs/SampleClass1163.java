package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1163 {

    @Ignore    private SampleClass1164 sampleClass;

    public SampleClass1163(){
        sampleClass = new SampleClass1164();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}