package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1809 {

    @Ignore    private SampleClass1810 sampleClass;

    public SampleClass1809(){
        sampleClass = new SampleClass1810();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}