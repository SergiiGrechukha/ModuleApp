package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1971 {

    @Ignore    private SampleClass1972 sampleClass;

    public SampleClass1971(){
        sampleClass = new SampleClass1972();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}