package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1883 {

    @Ignore    private SampleClass1884 sampleClass;

    public SampleClass1883(){
        sampleClass = new SampleClass1884();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}