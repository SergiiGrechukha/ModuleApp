package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass673 {

    @Ignore    private SampleClass674 sampleClass;

    public SampleClass673(){
        sampleClass = new SampleClass674();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}