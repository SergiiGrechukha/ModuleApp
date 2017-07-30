package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1356 {

    @Ignore    private SampleClass1357 sampleClass;

    public SampleClass1356(){
        sampleClass = new SampleClass1357();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}