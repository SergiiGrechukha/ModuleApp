package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass142 {

    @Ignore    private SampleClass143 sampleClass;

    public SampleClass142(){
        sampleClass = new SampleClass143();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}