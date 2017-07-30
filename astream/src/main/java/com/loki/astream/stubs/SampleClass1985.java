package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1985 {

    @Ignore    private SampleClass1986 sampleClass;

    public SampleClass1985(){
        sampleClass = new SampleClass1986();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}