package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1866 {

    @Ignore    private SampleClass1867 sampleClass;

    public SampleClass1866(){
        sampleClass = new SampleClass1867();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}