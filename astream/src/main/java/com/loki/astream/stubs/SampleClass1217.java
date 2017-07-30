package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1217 {

    @Ignore    private SampleClass1218 sampleClass;

    public SampleClass1217(){
        sampleClass = new SampleClass1218();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}