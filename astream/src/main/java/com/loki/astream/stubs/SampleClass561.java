package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass561 {

    @Ignore    private SampleClass562 sampleClass;

    public SampleClass561(){
        sampleClass = new SampleClass562();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}