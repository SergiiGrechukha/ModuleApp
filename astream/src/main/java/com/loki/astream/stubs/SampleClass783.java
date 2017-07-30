package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass783 {

    @Ignore    private SampleClass784 sampleClass;

    public SampleClass783(){
        sampleClass = new SampleClass784();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}