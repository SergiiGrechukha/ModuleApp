package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1202 {

    @Ignore    private SampleClass1203 sampleClass;

    public SampleClass1202(){
        sampleClass = new SampleClass1203();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}