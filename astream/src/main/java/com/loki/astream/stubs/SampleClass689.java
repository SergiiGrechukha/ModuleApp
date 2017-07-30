package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass689 {

    @Ignore    private SampleClass690 sampleClass;

    public SampleClass689(){
        sampleClass = new SampleClass690();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}