package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass723 {

    @Ignore    private SampleClass724 sampleClass;

    public SampleClass723(){
        sampleClass = new SampleClass724();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}