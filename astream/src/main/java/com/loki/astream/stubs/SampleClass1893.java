package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1893 {

    @Ignore    private SampleClass1894 sampleClass;

    public SampleClass1893(){
        sampleClass = new SampleClass1894();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}