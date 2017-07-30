package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass476 {

    @Ignore    private SampleClass477 sampleClass;

    public SampleClass476(){
        sampleClass = new SampleClass477();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}