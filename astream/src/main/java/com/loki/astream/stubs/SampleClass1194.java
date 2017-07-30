package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1194 {

    @Ignore    private SampleClass1195 sampleClass;

    public SampleClass1194(){
        sampleClass = new SampleClass1195();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}