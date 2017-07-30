package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass208 {

    @Ignore    private SampleClass209 sampleClass;

    public SampleClass208(){
        sampleClass = new SampleClass209();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}