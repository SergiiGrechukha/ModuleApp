package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass619 {

    @Ignore    private SampleClass620 sampleClass;

    public SampleClass619(){
        sampleClass = new SampleClass620();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}