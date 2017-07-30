package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1324 {

    @Ignore    private SampleClass1325 sampleClass;

    public SampleClass1324(){
        sampleClass = new SampleClass1325();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}