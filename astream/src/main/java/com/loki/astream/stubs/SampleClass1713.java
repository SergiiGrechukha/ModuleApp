package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1713 {

    @Ignore    private SampleClass1714 sampleClass;

    public SampleClass1713(){
        sampleClass = new SampleClass1714();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}