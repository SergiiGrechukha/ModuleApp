package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass762 {

    @Ignore    private SampleClass763 sampleClass;

    public SampleClass762(){
        sampleClass = new SampleClass763();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}