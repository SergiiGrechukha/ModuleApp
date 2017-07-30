package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1828 {

    @Ignore    private SampleClass1829 sampleClass;

    public SampleClass1828(){
        sampleClass = new SampleClass1829();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}