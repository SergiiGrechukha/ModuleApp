package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1286 {

    @Ignore    private SampleClass1287 sampleClass;

    public SampleClass1286(){
        sampleClass = new SampleClass1287();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}