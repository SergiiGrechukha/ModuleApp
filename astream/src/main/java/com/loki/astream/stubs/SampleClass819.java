package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass819 {

    @Ignore    private SampleClass820 sampleClass;

    public SampleClass819(){
        sampleClass = new SampleClass820();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}