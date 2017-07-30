package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass469 {

    @Ignore    private SampleClass470 sampleClass;

    public SampleClass469(){
        sampleClass = new SampleClass470();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}