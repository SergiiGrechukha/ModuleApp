package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1662 {

    @Ignore    private SampleClass1663 sampleClass;

    public SampleClass1662(){
        sampleClass = new SampleClass1663();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}