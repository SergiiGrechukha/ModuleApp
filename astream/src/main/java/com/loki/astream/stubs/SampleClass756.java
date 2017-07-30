package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass756 {

    @Ignore    private SampleClass757 sampleClass;

    public SampleClass756(){
        sampleClass = new SampleClass757();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}