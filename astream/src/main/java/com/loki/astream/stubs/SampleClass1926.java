package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1926 {

    @Ignore    private SampleClass1927 sampleClass;

    public SampleClass1926(){
        sampleClass = new SampleClass1927();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}