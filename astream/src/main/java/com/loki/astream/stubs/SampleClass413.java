package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass413 {

    @Ignore    private SampleClass414 sampleClass;

    public SampleClass413(){
        sampleClass = new SampleClass414();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}