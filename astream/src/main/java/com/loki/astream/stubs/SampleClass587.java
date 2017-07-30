package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass587 {

    @Ignore    private SampleClass588 sampleClass;

    public SampleClass587(){
        sampleClass = new SampleClass588();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}